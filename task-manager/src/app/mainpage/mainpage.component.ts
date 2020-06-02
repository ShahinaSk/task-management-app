import { Component, OnInit, Input } from '@angular/core';
import { NewTask } from "../addtaskform/newtask";
import { Router , ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-mainpage',
  templateUrl: './mainpage.component.html',
  styleUrls: ['./mainpage.component.sass']
})
export class MainpageComponent implements OnInit {

data:any;

  firstBoard = false
  secondBoard = false
  thirdBoard = false



  

  constructor(private router: Router,private activatedRouter: ActivatedRoute) {}

   ngDoCheck()
   {
     if(this.data.status == 'New')
       this.firstBoard = true
     else if(this.data.status == 'In-progress')
       this.secondBoard = true
     else if(this.data.status == 'Completed')
       this.thirdBoard = true  
       

       //console.log(this.taskData.status)
   }

   ngOnInit() {
    this.activatedRouter.queryParams.subscribe((params)=>{
      this.data= JSON.parse(atob(params.data))
    })

  }

}
