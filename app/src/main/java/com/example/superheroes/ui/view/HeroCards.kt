package com.example.superheroes.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroes.model.Hero
import com.example.superheroes.model.HeroesRepository
import com.example.superheroes.ui.theme.SuperheroesTheme

@Composable
fun HeroCards(
    modifier: Modifier = Modifier,
    heroes: List<Hero>
) {
    Column(modifier = modifier.padding(horizontal = 16.dp)) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(heroes) { hero ->
                HeroCard(hero = hero)
            }
        }
    }
}

@Composable
@Preview
fun HeroCardsPreview() {
    SuperheroesTheme {
        HeroCards(heroes = HeroesRepository.heroes)
    }
}