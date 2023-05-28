theme: /

    state: Hello
        q!: $regex</start>
        intent!: /Привет
        random: 
            a: Привет!
            a: Рад тебя видеть!

    state: Weather
        intent!: /Погода
        random:
            a: Погода хорошая
            a: Как-то не очень погода
            a: Дождя не будет (но это не точно)
            a: Мне нравится любая погода

    state: Currency
        intent!: /Курс валют
        random:
            a: Доллары дорого
            a: Покупай юани
            a: Скоро все рублями платить будут

    state: NoMatch
        event!: noMatch
        random:
            a: Извини, я не понял твой запрос
            a: К сожалению, ничего не могу ответить на это