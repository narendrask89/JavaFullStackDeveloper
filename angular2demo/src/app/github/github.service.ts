import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';
import { Response } from '@angular/http/src/static_response';
import { Observable } from 'rxjs';


@Injectable()
export class GithubService {

  constructor(private http: Http) { }

  getUser(searchData): Observable<any> {
    const url = 'http://api.github.com/search/users?q=' + searchData;
    return this.http.get(url).map(
      res => res.json()
    );
  }
}
