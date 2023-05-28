theme: /

    state: /hello
        q!: $regex</start>
        intent!: /hello
        random: 
            a: Привет!
            a: Рад тебя видеть!

    state: /weather
        intent!: /weather
        random:
            a: Погода хорошая
            a: Как-то не очень погода
            a: Дождя не будет (но это не точно)
            a: Мне нравится любая погода

    state: /currency
        intent!: /currency
        random:
            a: Доллары дорого
            a: Покупай юани
            a: Скоро все рублями платить будут

    state: /NoMatch
        event!: noMatch
        random:
            a: Извини, я не понял твой запрос
            a: К сожалению, ничего не могу ответить на это