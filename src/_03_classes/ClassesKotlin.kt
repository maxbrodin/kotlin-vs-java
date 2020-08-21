package _03_classes

import java.util.*

data class WorkspaceKotlin(
    val accountId: String,
    val id: String,
    val alias: String,
    val status: String,
    val createdAt: Date,
    val createdBy: String,
    val updatedAt: Date,
    val updatedBy: String
) 
