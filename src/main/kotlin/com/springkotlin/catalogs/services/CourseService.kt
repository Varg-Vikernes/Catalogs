package com.springkotlin.catalogs.services

import com.springkotlin.catalogs.dtos.CourseDTO
import com.springkotlin.catalogs.entities.Courses
import com.springkotlin.catalogs.repositories.CourseRepository
import mu.KLogging

class CourseService (val courseRepository: CourseRepository){
    companion object: KLogging()

        fun add(courseDTO: CourseDTO): CourseDTO{
            val courseEntity = courseDTO.let{Courses(null,it.name,it.category)};
                return courseEntity.let { CourseDTO(it.id , it.name, it.category ) }
        }
}