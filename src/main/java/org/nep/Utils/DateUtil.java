package org.nep.Utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    /**
     * ddMMyyy
     */
    public static final String SIMPLE         = "ddMMyyy";
    /**
     * yyyyMMdd
     */
    public static final String SIMPLE_REVERSE = "yyyyMMdd";
    /**
     * dd/MM/yyyy
     */
    public static final String SIMPLE_SLASH   = "dd/MM/yyyy";
    /**
     * dd.MM.yyyy
     */
    public static final String SIMPLE_DOT     = "dd.MM.yyyy";
    /**
     * dd.MM.yyyy HH:mm:ss
     */
    public static final String BIG_COMBO      = "dd.MM.yyyy HH:mm:ss";
    /**
     * HH.mm.ss
     */
    public static final String TIME           = "HH.mm.ss";

    /**
     * Получить текущую дату в формате ddMMyyy
     *
     * @return дата
     */
    public static String getCurrentDay() {
        return new SimpleDateFormat("ddMMyyy").format(new Date()).toString();
    }

    /**
     * Получить текущую дату в формате yyyyMMdd
     *
     * @return дата
     */
    public static String getCurrentDayReverse() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date()).toString();
    }

    /**
     * Получить текущую дату в формате dd/MM/yyyy
     *
     * @return дата
     */
    public static String getCurrentDaySlash() {
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date()).toString();
    }

    /**
     * Получить текущую дату в формате dd.MM.yyyy
     *
     * @return дата
     */
    public static String getCurrentDayPoint() {
        return new SimpleDateFormat("dd.MM.yyyy").format(new Date()).toString();
    }

    /**
     * Получить текущую дату и время в формате dd.MM.yyyy HH:mm:ss
     *
     * @return дата
     */
    public static String getCurrentDataTime() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date()).toString();
    }

    /**
     * Получить текущее время в формате HH.mm.ss
     *
     * @return дата
     */
    public static String getCurrentTime() {
        return new SimpleDateFormat("HH.mm.ss").format(new Date()).toString();
    }

    /**
     * Получить текущую дату плюс/минус N дней в формате dd.MM.yyyy
     *
     * @param n Количество дней, которое нужно прибавить/убавить
     * @return дата
     */
    public static String getPlusMinusDay(int n) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR, n);
        Date date = c.getTime();
        return new SimpleDateFormat("dd.MM.yyyy").format(date).toString();
    }

    /**
     * Получить текущую дату плюс/минус N иесяцев в формате dd.MM.yyyy
     *
     * @param n Количество месяцев, которое нужно прибавить/убавить
     * @return дата
     */
    public static String getPlusMinusMonth(int n) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, n);
        Date date = c.getTime();
        return new SimpleDateFormat("dd.MM.yyyy").format(date).toString();
    }

    /**
     * Получить текущую дату плюс/минус N иесяцев в формате dd/MM/yyyy
     *
     * @param n Количество месяцев, которое нужно прибавить/убавить
     * @return дата
     */
    public static String getPlusMinusMonthSlash(int n) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, n);
        Date date = c.getTime();
        return new SimpleDateFormat("dd/MM/yyyy").format(date).toString();
    }

    /**
     * Получить текущую дату +- указанное количество дней либо месяцев от текущей. Универсальный метод.
     *
     * @param format Формат даты. Доступны в константах класса
     * @param extraDays +- дни от текущей даты либо 0
     * @param extraMonths +- месяцы от текуще даты либо 0
     * @return дата
     */
    public static final String getDate(String format, int extraDays, int extraMonths) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR, extraDays);
        c.add(Calendar.MONTH, extraMonths);
        Date date = c.getTime();
        return new SimpleDateFormat(format).format(date).toString();
    }

}