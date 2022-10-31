import { Component, OnInit } from '@angular/core';
import { PokemonService } from 'src/app/services/pokemon/pokemon.service';
import { Router, ActivatedRoute, Params } from '@angular/router';
import { Ipokemon } from 'src/app/interaces/ipokemon';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  pokemonsT: Ipokemon[] = [];
  pokemons: any;
  pokemonosCopy: any;
  constructor(
    public pokemonService: PokemonService,
    private _route: ActivatedRoute,
    private _router: Router
  ) {}

  ngOnInit(): void {
    /* Obtienen  todos los pokemons*/
    this.pokemonService.getAllPokemons().subscribe(
      (resp) => {
        this.pokemonsT = resp;

        this.pokemonosCopy = this.pokemonsT;
      },
      (error) => {
        console.error(error);
      }
    );
  }

  /*Metodo busqueda del poquemon */
  filter(e: any) {
    const search: string = e.target.value;

    this.pokemonsT = this.pokemonosCopy?.filter(({ nombre }: Ipokemon) => {
      return nombre.toLowerCase().includes(search.toLowerCase());
    });
  }
  /*redireccionar la vista al detalle*/
  //dd
  detallepokemon(id: any) {
    this._router.navigate(['/detalle/', id]);
  }
}
