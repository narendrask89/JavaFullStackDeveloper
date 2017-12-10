import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-practice',
  templateUrl: './practice.component.html',
  styleUrls: ['./practice.component.css']
})
export class PracticeComponent implements OnInit {

  public myTodos = [ 'Java 8',
    'Spring core with Spring MVC4',
    'Spring with Hibernate',
    'HTML5 CCS3 Bootstrap3',
    'Jboss Fuse with Apache Camel'
  ];
  public practice = 'Practice Angularjs for this week';

  constructor() { }

  ngOnInit() {
    this.practice = 'Practice Angular2 for this week';
  }

  clickEvent() {
    this.practice = 'Practice Angular2 with Typescript this week';
  }
}
