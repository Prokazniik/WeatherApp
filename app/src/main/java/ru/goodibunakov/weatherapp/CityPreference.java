package ru.goodibunakov.weatherapp;


import android.app.Activity;
import android.content.SharedPreferences;

class CityPreference {

    //Вспомогательный класс для хранения выбранного города
    SharedPreferences prefs;

    CityPreference(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // Если пользователь не выбрал город, на умолчанию
    // будем показывать погоду на Пермь
    String getCity() {
        return prefs.getString("city", "Perm");
    }

    void setCity(String city) {
        prefs.edit().putString("city", city).apply();
    }
}

