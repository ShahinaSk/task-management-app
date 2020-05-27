import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-viewtaskdetails',
  templateUrl: './viewtaskdetails.component.html',
  styleUrls: ['./viewtaskdetails.component.sass']
})
export class ViewtaskdetailsComponent implements OnInit {

  @Input()
      viewData: any[] = []

  constructor() { }

  ngOnInit() {
  }

}
