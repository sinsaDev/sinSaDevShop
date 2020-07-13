package com.min.android.sinsadevshop.views

class StudentController(val schoolService: SchoolService) {
    fun print() : String{
        return "현재 재학중인 학교 : ${schoolService.schoolName}"
    }
}