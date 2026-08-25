package com.my_garage.features.car.domain.model

data class Car(
    val brand : String,
    val model : String,
    val trim : String,
    val year : Int,
    val currentMileage : Double,
    val engineSize : Double,
    val engineType : String,
    val fuelType : String,
    val transmissionType : String,
    val power : String,
    val torque : String,
    val acceleration : String,
    val driveTrain : String, // eg AWD


)
