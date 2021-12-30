package com.example.gameb.data

import com.example.gameb.R
import com.example.gameb.model.*

object DataSource {

    val genre1 = Genre("Жанр: Action-adventure")

    val user1 = User("Андрей", "Аношкин", "cscsdc@mail.ru", "123456",1)

    val reviews = listOf(
         Review(user1,"06.11.2021","Это самая атмосферная игра во всем мире, даже сталкер который с ней постоянно сравнивают даже рядом не стоял",  1)
    )
    val Shops = listOf(
        Shop(R.drawable.shop_ic_steam,"Steam",1500,"есть", "5%"),
        Shop(R.drawable.shop_ic_epic,"Epic Games Store",1420,"нет", "10%"),
        Shop(R.drawable.shop_ic_gog,"GOG games",1700,"есть", "-")
    )
    val Game = listOf(
        Game(R.drawable.game_icon_0,"Ведьмак 3: Дикая Охота","Ведьмак Геральт из Ривии, легендарный охотник на чудовищ, оказался в центре борьбы за мировое господство.", genre1, reviews),
        Game(R.drawable.game_icon_1,"Metro: Исход","мультиплатформенная игра в жанре «шутер от первого лица» с элементами сурвайвал-хоррора и стелс-экшена по мотивам «Вселенной Метро 2033». Разработкой игры занимались украинская студия «4A Games»",genre1,reviews),
        Game(R.drawable.game_icon_2,"Red Dead Redemption 2","представляет собой игру в жанре action-adventure с открытым миром; игрок управляет одним персонажем с видом от первого или от третьего лица по своему выбору.",genre1,reviews)

    )
}