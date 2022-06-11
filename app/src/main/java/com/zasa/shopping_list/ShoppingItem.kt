package com.zasa.shopping_list

import androidx.room.Entity

/**
 **@Project -> Shopping_List
 **@Author -> Sangeeth on 6/12/2022
 */

@Entity(tableName = "shopping_item")
data class ShoppingItem(var name : String, var amount : Int )
