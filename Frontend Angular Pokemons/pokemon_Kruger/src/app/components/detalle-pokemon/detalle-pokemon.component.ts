import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, Params } from '@angular/router';
import { Ipokemon } from 'src/app/interaces/ipokemon';
import { PokemonService } from 'src/app/services/pokemon/pokemon.service';

@Component({
  selector: 'app-detalle-pokemon',
  templateUrl: './detalle-pokemon.component.html',
  styleUrls: ['./detalle-pokemon.component.css'],
})
export class DetallePokemonComponent implements OnInit {
  pokemon: any;
  constructor(
    public pokemonService: PokemonService,
    private _route: ActivatedRoute,
    private _router: Router
  ) {}

  ngOnInit(): void {
    // Obtengo el id del pokemon enviado del otra ventana
    const id = this._route.snapshot.params['id'];

    //this.pokemon = this.pokemonService.getPokemon(id);
    this.pokemonService.getPokemon(id).subscribe(
      (resp) => {
        this.pokemon = resp;
      },
      (error) => {
        console.error(error);
      }
    );
  }
}
