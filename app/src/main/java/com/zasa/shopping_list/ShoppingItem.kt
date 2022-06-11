package com.zasa.shopping_list

import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 **@Project -> Shopping_List
 **@Author -> Sangeeth on 6/12/2022
 */

@Entity(tableName = "shopping_item")
data class ShoppingItem(

    @ColumnInfo(name = "item_name")
    var name : String,
    @ColumnInfo(name = "item_amount")
    var amount : Int
    
    )

