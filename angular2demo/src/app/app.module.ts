import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpModule} from '@angular/http';
import {MatCardModule} from '@angular/material';


import {AppComponent} from './app.component';
import {PracticeComponent} from './practice/practice.component';
import {SearchComponent} from './search/search.component';


@NgModule({
  declarations: [
    AppComponent,
    PracticeComponent,
    SearchComponent
  ],
  imports: [
    BrowserModule, HttpModule, MatCardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
