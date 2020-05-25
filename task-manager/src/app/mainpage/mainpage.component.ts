import { Component, OnInit, Input } from '@angular/core';


@Component({
  selector: 'app-mainpage',
  templateUrl: './mainpage.component.html',
  styleUrls: ['./mainpage.component.sass']
})
export class MainpageComponent implements OnInit {

  firstBoard = false
  secondBoard = false
  thirdBoard = false


@Input()    
    taskData: any[] = []



  constructor() {

    
   }

   ngDoCheck()
   {
     if(this.taskData[2] == 'New')
       this.firstBoard = true
     else if(this.taskData[2] == 'In-progress')
       this.secondBoard = true
     else if(this.taskData[2] == 'Completed')
       this.thirdBoard = true    
   }

  ngOnInit() {

    
      
  }

}
