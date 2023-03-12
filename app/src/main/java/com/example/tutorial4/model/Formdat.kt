package com.example.tutorial4.model

import com.example.tutorial4.model.validation.ValidationResult

class Formdat (
    private var studentID:String,
    private var year:String,
    private var semester:String,
    private var agree:Boolean
    ) {

    fun validateStudentID():ValidationResult {

        return if (studentID.isEmpty())
        {
            ValidationResult.Empty("Student ID is empty")
        }
        else if (studentID.length!=10)
        {
            ValidationResult.Invalid("ID should have 10 digits")
        }
        else if (!studentID.startsWith("IT",true))
        {
            ValidationResult.Invalid("ID should start with IT")
        }
        else {
            ValidationResult.Valid
        }

    }

    fun validateYear():ValidationResult {

        return if (year.isEmpty()) {
            ValidationResult.Empty("Year is Empty")
        }else {
            ValidationResult.Valid
        }

    }

    fun validateSemester():ValidationResult {

        return if (semester.isEmpty()) {
            ValidationResult.Empty("Semester is Empty")
        }else {
            ValidationResult.Valid
        }

    }

    fun validateAgreement():ValidationResult {

        return if(!agree){
            ValidationResult.Empty("You must agree for the terms and conditions")
        }else{
            ValidationResult.Valid
        }

    }

}