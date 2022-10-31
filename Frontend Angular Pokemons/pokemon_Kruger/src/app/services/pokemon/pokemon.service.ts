import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Ipokemon } from 'src/app/interaces/ipokemon';

@Injectable({
  providedIn: 'root',
})
export class PokemonService {
  private pokemonsUrl = 'http://localhost:8092/pokemones/';

  constructor(private http: HttpClient) {}

  public getAllPokemons(): Observable<any> {
    return this.http.get(this.pokemonsUrl);
  }
  /*Debe devolver desde la API un pokemon con el ID seleccionado*/
  public getPokemon(id: any): Observable<any> {
    return this.http.get(this.pokemonsUrl + 'detalle/' + id);
  }
}
