package com.pokemonKrugerStart.web.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemonKrugerStart.web.model.Pokemon;
import com.pokemonKrugerStart.web.service.PokemonService;

@RestController
@RequestMapping("/pokemones/")
public class PokemonRest {

	@Autowired
	private PokemonService pokemonService;

	@GetMapping
	private ResponseEntity<List<Pokemon>> getAllPokemon() {
		return ResponseEntity.ok(pokemonService.findAll());
	}
	
	@GetMapping(value="/detalle/{id}")
	public ResponseEntity<Optional<Pokemon>> getEmployeById(@PathVariable("id") Long id){
		return ResponseEntity.ok(pokemonService.findById(id));
	}
	
	

}
