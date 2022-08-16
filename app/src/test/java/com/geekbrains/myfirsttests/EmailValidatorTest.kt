package com.geekbrains.myfirsttests

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_NotGmail_ReturnsFalse() {
        assertFalse(EmailValidator.isGmail("name@email.com"))
    }

    @Test
    fun emailValidator_NotYandex_ReturnsFalse() {
        assertFalse(EmailValidator.hasYandexDomain("name@email.com"))
    }

    @Test
    fun emailValidator_IsGmail_ReturnsTrue() {
        assertTrue(EmailValidator.isGmail("name@gmail.com"))
    }

    @Test
    fun emailValidator_IsYandex_ReturnsTrue() {
        assertTrue(EmailValidator.hasYandexDomain("name@yandex.com"))
    }
}
