import { Component, OnInit } from '@angular/core';
import { NewTask } from "./newtask";
import { CombineLatestOperator } from 'rxjs/internal/observable/combineLatest';
import { Router , ActivatedRoute} from '@angular/router';
//import { MainpageComponent } from "../mainpage/mainpage.component";
import { FormGroup,FormControl,Validators } from "@angular/forms";


@Component({
  selector: 'app-addtaskform',
 templateUrl: './addtaskform.component.html',
styleUrls: ['./addtaskform.component.sass']
})
export class AddtaskformComponent implements OnInit {

form:any;

 constructor(private router: Router,private activatedRouter: ActivatedRoute){

    this.form = new FormGroup({
        taskName:new FormControl("",Validators.required),
        labelName:new FormControl("",Validators.required),
        status:new FormControl("",Validators.required),
        dueDate:new FormControl("",Validators.required)
})


 }

 onSubmit()
 {
let data:any = this.form.value

   this.router.navigate(['/mainpage'],{

queryParams:{data:btoa(JSON.stringify(data))}    
   })
 }

  public statusArray = ['New','In-progress','Completed'];
 
 
 /* taskName:string = ''
  labelName:string = ''
  status:string = ''
  dueDate:Date = new Date


  public userModel = new NewTask('','','',new Date)
*/
  


  /*onSubmit()
  {
      this.taskName = this.userModel.name
      this.labelName = this.userModel.label
      this.status = this.userModel.status
      this.dueDate = this.userModel.dueDate
      this.router.navigate(['/mainpage'])
  }
  */
  
  
  ngOnInit() {
  }
  
  
  
  
  /*
  //public status = this.userModel.status

   taskName:string = ''
   labelName:string = ''
   status:string = ''
   dueDate:Date = new Date

//  data: any[] = []
  
  onSubmit(taskName,labelName,status,dueDate)
   {
    // console.log("hi")
  //   this.userModel = userModel
    this.data.push(taskName)
     this.data.push(labelName)
     this.data.push(status)
     this.data.push(dueDate)
     this.router.navigate(['/mainpage'])
   }
*/



  

}
