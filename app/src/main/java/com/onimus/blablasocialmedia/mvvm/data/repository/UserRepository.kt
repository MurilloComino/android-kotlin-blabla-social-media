/*
 *
 *  * Created by Murillo Comino on 26/10/19 13:56
 *  * Github: github.com/MurilloComino
 *  * StackOverFlow: pt.stackoverflow.com/users/128573
 *  * Email: murillo_comino@hotmail.com
 *  *
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 26/10/19 13:56
 *
 */

package com.onimus.blablasocialmedia.mvvm.data.repository

import com.onimus.blablasocialmedia.mvvm.data.firebase.FirebaseManager

class UserRepository(private val firebase: FirebaseManager) {

    fun onRegisterClicked(email: String, password: String) = firebase.onRegisterClicked(email, password)

    fun onLoginClicked(email: String, password: String) = firebase.onLoginClicked(email, password)

    fun currentUser() = firebase.currentUser()

    fun logout() = firebase.logout()
}