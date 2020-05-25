import { Component, OnInit } from '@angular/core';
import { NewTask } from "./newtask";
import { CombineLatestOperator } from 'rxjs/internal/observable/combineLatest';
//import { MainpageComponent } from "../mainpage/mainpage.component";

@Component({
  selector: 'app-addtaskform',
 templateUrl: './addtaskform.component.html',
styleUrls: ['./addtaskform.component.sass']
})
export class AddtaskformComponent implements OnInit {


 constructor(){}

  public statusArray = ['New','In-progress','Completed'];

  public userModel = new NewTask('','','',new Date)

  //public status = this.userModel.status

   taskName:string = ''
   labelName:string = ''
   status:string = ''
   dueDate:Date = new Date

  data: any[] = []
  onSubmit(taskName,labelName,status,dueDate)
   {
     console.log("hi")
  //   this.userModel = userModel
    this.data.push(taskName)
     this.data.push(labelName)
     this.data.push(status)
     this.data.push(dueDate)
   }




  ngOnInit() {
  }

}
