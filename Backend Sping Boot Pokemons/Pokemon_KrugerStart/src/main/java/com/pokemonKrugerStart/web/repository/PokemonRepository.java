package com.pokemonKrugerStart.web.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemonKrugerStart.web.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}
