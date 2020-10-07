package ru.skillbranch.devintensive.utils

object Utils {

    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0).setNullOrEmpty()
        val lastName = parts?.getOrNull(1).setNullOrEmpty()
        return Pair(firstName, lastName)
    }


    private fun String?.setNullOrEmpty() :String {
        if (this == "" || this == null)
            return "null"
        else return this
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        val name = firstName.orEmpty().trim().getOrNull(0)?.toUpperCase()
        val surname = lastName.orEmpty().trim().getOrNull(0)?.toUpperCase()
        val firstInit = name?.toString()?: ""
        val secondInit = surname?.toString()?: ""
        return "$firstInit $secondInit".ifEmpty { null }

    }

    fun transliteraion(payload: String, divider: String = " "): String {
TODO()
    }

}
