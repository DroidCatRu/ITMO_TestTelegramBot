theme: /

    state: Hello
        q!: *start
        q!: * {(привет*/здравствуй*/hello/hi)} *
        random:
            a: Привет!
            a: Рад тебя видеть!

    state: Weather
        q!: * {(*погода/weather)} *
        random:
            a: Погода хорошая
            a: Как-то не очень погода

    state: Currency
        q!: * {(доллар*/курс*/валют*/currency)} *
        random:
            a: Доллары дорого
            a: Покупай юани
            a: Скоро все рублями платить будут

    state: NoMatch
        event!: noMatch
        random:
            a: Извини, я не понял твой запрос
            a: К сожалению, ничего не могу ответить на это
