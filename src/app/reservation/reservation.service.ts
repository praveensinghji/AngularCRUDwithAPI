import { Injectable } from '@angular/core';
import { Reservation } from '../models/reservation';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ReservationService {
  private apiUrl= "http://localhost:8080";

  constructor(private http:HttpClient){
  }

  //CRUD
  getReservations() : Observable<Reservation[]>{
    return this.http.get<Reservation[]>(this.apiUrl+'/allList');
  }

  getReservation(id:string) : Observable<Reservation>{
    return this.http.get<Reservation>(this.apiUrl+'/allList/'+id);
  }

  addReservation(reservation :Reservation) : Observable<void>{
    return this.http.post<void>(this.apiUrl+'/add',reservation);
  } 

  deleteReservation(id :string) : Observable<void>{
    return this.http.delete<void>(this.apiUrl+'/delete/'+id);
  }

  updateReservation(id:string,updateReservation : Reservation) : Observable<void>{
    return this.http.put<void>(this.apiUrl+'/update',updateReservation);
  }
}
