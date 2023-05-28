require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Hello
        q!: *start
        q!: * (привет*|здравствуй*|hello|hi) *
        random:
            a: Привет!
            a: Рад тебя видеть!

    state: Weather
        intent!: /weather
        a: Погода хорошая

    state: Currency
        intent!: /currency
        a: Доллары дорого

    state: NoMatch
        event!: noMatch
        random:
            a: Извините, я не понял твой запрос.
            a: К сожалению, ничего не могу ответить на это.

    state: Match
        event!: match
        a: {{$context.intent.answer}}
