import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReservationListComponent } from '../reservation-list/reservation-list.component';
import { ReservationFormComponent } from '../reservation-form/reservation-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HomeModule } from '../home/home.module';
import { HttpClient } from '@angular/common/http';


@NgModule({
  declarations: [ReservationFormComponent, ReservationListComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    HomeModule,
    HttpClient
  ]
})
export class ReservationModule {

}
