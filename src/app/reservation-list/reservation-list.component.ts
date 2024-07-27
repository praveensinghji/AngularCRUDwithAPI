import { Component, OnInit } from '@angular/core';
import { Reservation } from '../models/reservation';
import { ReservationService } from '../reservation/reservation.service';
import { CommonModule } from '@angular/common';
import { Router, RouterModule } from '@angular/router';
import { HomeComponent } from '../home/home.component';


@Component({
  selector: 'app-reservation-list',
  standalone: true,
  imports: [CommonModule,RouterModule,HomeComponent],
  templateUrl: './reservation-list.component.html',
  styleUrl: './reservation-list.component.css'
})
export class ReservationListComponent implements OnInit{
  
  reservations: Reservation[] = [];
  jsonString: any;
  loading:boolean=true;
  constructor(private reservationService: ReservationService,private router:Router){
    this.loadingData();
  }

  ngOnInit(): void {
    this.loadingData();
  }

  loadingData(){
    this.reservationService.getReservations().subscribe(data=>{
      this.loading=false;
      this.reservations = data;  
    });
  }

  onDelete(id: string){
    console.log("on delete");
    this.reservationService.deleteReservation(id).subscribe(data=>{
      this.loadingData();
    })
  }
}
