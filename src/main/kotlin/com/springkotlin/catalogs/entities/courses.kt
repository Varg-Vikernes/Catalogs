package com.springkotlin.catalogs.entities

import com.springkotlin.catalogs.common.TypeCourse
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table
import org.springframework.data.annotation.Id


@Entity
@Table(name ="te_courses")
data class Courses(
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int ?,
    var name : String,
    var category: TypeCourse = TypeCourse.MANDATORY
)
