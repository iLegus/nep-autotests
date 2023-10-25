# language: ru
@mobile
Функция: Расчет Антиклещ

  Структура сценария: логин расчет
    Пусть логин каскотест
    Пусть переходим меню в Антиклещ
    Пусть Заполняем все данные для рассчета клеща
      | ДатаРождения    | <ДатаРождения>    |
      | ФИОСтрахователя | <ФИОСтрахователя> |
      | Паспорт         | <Паспорт>         |
      | Место           | <Место>           |
      | ДатаВыдачи                |<ДатаВыдачи>                   |
      | Телефон         | <Телефон>         |
      | Почта           | <Почта>           |
      | ФИОСтрахуемого  | <ФИОСтрахуемого>  |


    Примеры:
      | ДатаРождения | ФИОСтрахователя      | Паспорт     | Место |ДатаВыдачи| Телефон    | Почта               | ФИОСтрахуемого       |
      | 17.06.1991   | Иванов Иван Иванович | 1231 231231 | УВД   |01.01.2020| 9002020202 | jfdhjsdhfu@enue.com | Иванов Иван Иванович |
