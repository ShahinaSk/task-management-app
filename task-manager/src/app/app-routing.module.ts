import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddtaskformComponent } from './addtaskform/addtaskform.component';
import { AppComponent } from "./app.component";
import { MainpageComponent } from './mainpage/mainpage.component';

const routes: Routes =  [
  {path: 'addtask',component: AddtaskformComponent },
  {path: 'mainpage', component: MainpageComponent}
  ]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
