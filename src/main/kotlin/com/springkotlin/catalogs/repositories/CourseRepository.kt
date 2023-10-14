package com.springkotlin.catalogs.repositories

import com.springkotlin.catalogs.entities.Courses
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepository : JpaRepository <Courses, Int>