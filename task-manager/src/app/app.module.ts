import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FormsModule } from "@angular/forms";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddtaskformComponent } from "/home/shahina/task-management-app/task-manager/src/app/addtaskform/addtaskform.component";
import { RouterModule, Routes } from "@angular/router";
import { MainpageComponent } from './mainpage/mainpage.component';




@NgModule({
  declarations: [
    AppComponent,
  //  FileuploadComponent,
    AddtaskformComponent,
    AppComponent,
    MainpageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
