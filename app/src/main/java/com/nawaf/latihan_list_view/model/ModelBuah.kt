package com.nawaf.latihan_list_view.model

import com.nawaf.latihan_list_view.R

data class ModelBuah(
    val image: Int, val deskripsi : String
)

//bikin array data
object MockList{
    fun getModel() : List<ModelBuah>{
        val itemmodel1 = ModelBuah(
            R.drawable.apple,
            "Apple",
        )
        val itemmodel2 = ModelBuah(
            R.drawable.grapes,
            "Anggur",
        )
        val itemmodel3 = ModelBuah(
            R.drawable.orange,
            "Jeruk",
        )
        val itemmodel4 = ModelBuah(
            R.drawable.pear,
            "Pear",
        )
        val itemmodel5 = ModelBuah(
            R.drawable.strawberry,
            "Strowbery",
        )


        val itemlist : ArrayList<ModelBuah> = ArrayList()
        itemlist.add(itemmodel1)
        itemlist.add(itemmodel2)
        itemlist.add(itemmodel3)
        itemlist.add(itemmodel4)
        itemlist.add(itemmodel5)

        return itemlist

    }

}