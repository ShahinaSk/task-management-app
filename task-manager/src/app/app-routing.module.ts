import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddtaskformComponent } from './addtaskform/addtaskform.component';
import { AppComponent } from "./app.component";
import { MainpageComponent } from './mainpage/mainpage.component';
import { ViewtaskdetailsComponent } from './viewtaskdetails/viewtaskdetails.component';

const routes: Routes =  [
  {path: 'addtask',component: AddtaskformComponent},
  {path: 'mainpage', component: MainpageComponent},
  {path: 'viewtask', component: ViewtaskdetailsComponent}
  ]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
