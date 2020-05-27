import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewtaskdetailsComponent } from './viewtaskdetails.component';

describe('ViewtaskdetailsComponent', () => {
  let component: ViewtaskdetailsComponent;
  let fixture: ComponentFixture<ViewtaskdetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewtaskdetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewtaskdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
