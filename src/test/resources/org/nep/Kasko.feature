# language: ru
@kasko
Функция: Расчет Каско

  Структура сценария: логин расчет
    Пусть логин каскотест
    Пусть переходим меню в КАСКО
    Пусть Заполняем все данные для рассчета КАСКО
      | ГРЗ                  | <ГРЗ>                  |
      | Марка                | <Марка>                |
      | Модель               | <Модель>               |
      | Год                  | <Год>                  |
      | ВИН                  | <ВИН>                  |
      | ДатаНачала           | <ДатаНачала>           |
      | ДатаПокупки          | <ДатаПокупки>          |
      | Мощность             | <Мощность>             |
      | ОбъемДвигателя       | <ОбъемДвигателя>       |
      | Пробег               | <Пробег>               |
      | Двери                | <Двери>                |
      | Стоимость            | <Стоимость>            |
      | ФИОСобственника      | <ФИОСобственника>      |
      | ДатаРождСобственника | <ДатаРождСобственника> |
      | ПаспортСобств        | <ПаспортСобств>        |
      | АдресСобств          | <АдресСобств>          |
      | ВУ                   | <ВУ>                   |
      | НачалоСтажа          | <НачалоСтажа>          |
      | Ключи                | <Ключи>                |
      | Собственники         | <Собственники>         |
      | СТС                  | <СТС>                  |
      | СТСДата              | <СТСДата>              |
      | ПТС                  | <ПТС>                  |
      | ПТСДата              | <ПТСДата>              |
      | КодПодр              | <КодПодр>              |
      | КемВыданПаспорт      | <КемВыданПаспорт>      |
      | Телефон              | <Телефон>              |
      | Почта                | <Почта>                |
      | ДатаВыдачиПаспорта   | <ДатаВыдачиПаспорта>   |






    Примеры:
      | ДатаВыдачиПаспорта | Почта                | Телефон     | КемВыданПаспорт | КодПодр | ПТСДата    | ПТС         | СТС         | СТСДата    | Собственники | Ключи | ГРЗ       | Марка | Модель | Год  | ВИН               | ДатаНачала | ДатаПокупки | Мощность | ОбъемДвигателя | Пробег | Двери | Стоимость | ФИОСобственника      | ДатаРождСобственника | ПаспортСобств | АдресСобств                                  | ВУ          | НачалоСтажа |
      | 01.01.2020         | jdhfgjhdjgh@enue.com | 79000000041 | УВД             | 123123  | 06.07.2018 | 12АА 564521 | 1231 231231 | 06.07.2018 | 1            | 1     | К077ЕУ777 | KIA   | SOUL   | 2020 | XWEJT813BD7009301 | 01.01.2020 | 01.01.2023  | 129      | 1591           | 12000  | 5     | 1 973 200 | Федоров Мирон Янович | 17.08.1980           | 1312 413241   | г Москва, ул Дмитрия Ульянова, д 4/48, кв 56 | 1231 231231 | 17.05.2005  |