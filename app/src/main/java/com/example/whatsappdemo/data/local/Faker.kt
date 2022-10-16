package com.example.whatsappdemo.data.local

import com.example.whatsappdemo.R
import com.example.whatsappdemo.data.model.Call
import com.example.whatsappdemo.data.model.Chat
import com.example.whatsappdemo.data.model.Conversation
import com.example.whatsappdemo.data.model.Status

val calls = mutableListOf<Call>().apply {
    add(
        Call(
            "Shahrukh Khan",
            "https://static.toiimg.com/thumb/msid-69902898,imgsize-115506,width-800,height-600,resizemode-75/69902898.jpg",
            "Yesterday",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Salman Khan",
            "https://starsunfolded.com/wp-content/uploads/2013/08/Salman-Khan-picsss.jpg",
            "Friday",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Akshay Kumar",
            "https://images.outlookindia.com/public/uploads/articles/2019/12/7/Akshay-Kumar-3_571_855.jpg",
            "Thursday",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Aamir Khan",
            "https://filmfare.wwmindia.com/content/2020/apr/aamirkhan41588085012.jpg",
            "Monday",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Amitabh Bachan",
            "https://c.tribune.com.pk/2017/11/1551269-amitabhbachancopy-1509963604.jpg",
            "22/04/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Kartik Aryan",
            "https://imagevars.gulfnews.com/2018/12/03/TAB_181130_Kartik_Aaryan_AKK_16a08539c08_medium.jpg",
            "18/04/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Saif Ali Khan",
            "https://images.khaleejtimes.com/storyimage/KT/20181015/ARTICLE/181019430/AR/0/AR-181019430.jpg&MaxW=780&imageVersion=16by9&NCS_modified=20181015110716",
            "10/04/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Shahid Kapoor",
            "https://static.toiimg.com/thumb/msid-71336384,width-800,height-600,resizemode-75,imgsize-32094/71336384.jpg",
            "9/04/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Vicky Kaushal",
            "https://static.toiimg.com/thumb/msid-71003675,width-800,height-600,resizemode-75,imgsize-73670,pt-32,y_pad-40/71003675.jpg",
            "19/03/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Ayushman Khurana",
            "https://pbs.twimg.com/profile_images/1137343534644621312/M4sYuCso_400x400.jpg",
            "15/03/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Hritik Roshan",
            "https://wikibio.in/wp-content/uploads/2018/12/Hrithik-Roshan-Image.jpg",
            "12/03/20",
            R.drawable.ic_down_incoming
        )
    )
    add(
        Call(
            "Tiger Shroff",
            "https://img.etimg.com/thumb/width-640,height-480,imgsize-408708,resizemode-1,msid-72224533/tiger-shroff-scrapes-his-back-on-baaghi-3-set-posts-pictures-on-social-media.jpg",
            "1/03/20",
            R.drawable.ic_down_missed
        )
    )
    add(
        Call(
            "Ritesh Deshmukh",
            "https://filmfare.wwmindia.com/content/2018/dec/thu1545049017.jpg",
            "20/02/20",
            R.drawable.ic_down_missed
        )
    )

}

val chatsList = mutableListOf<Chat>().apply {
    add(
        Chat(
            "Shahrukh Khan",
            "https://static.toiimg.com/thumb/msid-69902898,imgsize-115506,width-800,height-600,resizemode-75/69902898.jpg",
            "Hey how are u?",
            "Yesterday",
            "0"
        )
    )
    add(
        Chat(
            "Salman Khan",
            "https://starsunfolded.com/wp-content/uploads/2013/08/Salman-Khan-picsss.jpg",
            "Hey how are u?",
            "Friday",
            "0"
        )
    )
    add(
        Chat(
            "Akshay Kumar",
            "https://images.outlookindia.com/public/uploads/articles/2019/12/7/Akshay-Kumar-3_571_855.jpg",
            "Hey how are u?",
            "Thursday",
            "2"
        )
    )
    add(
        Chat(
            "Aamir Khan",
            "https://filmfare.wwmindia.com/content/2020/apr/aamirkhan41588085012.jpg",
            "Hey how are u?",
            "Monday",
            "5"
        )
    )
    add(
        Chat(
            "Amitabh Bachan",
            "https://c.tribune.com.pk/2017/11/1551269-amitabhbachancopy-1509963604.jpg",
            "Hey how are u?",
            "22/04/20",
            "6"
        )
    )
    add(
        Chat(
            "Kartik Aryan",
            "https://imagevars.gulfnews.com/2018/12/03/TAB_181130_Kartik_Aaryan_AKK_16a08539c08_medium.jpg",
            "Hey how are u?",
            "18/04/20",
            "7"
        )
    )
    add(
        Chat(
            "Saif Ali Khan",
            "https://images.khaleejtimes.com/storyimage/KT/20181015/ARTICLE/181019430/AR/0/AR-181019430.jpg&MaxW=780&imageVersion=16by9&NCS_modified=20181015110716",
            "Hey how are u?",
            "10/04/20",
            "1"
        )
    )
    add(
        Chat(
            "Shahid Kapoor",
            "https://static.toiimg.com/thumb/msid-71336384,width-800,height-600,resizemode-75,imgsize-32094/71336384.jpg",
            "Hey how are u?",
            "9/04/20",
            "0"
        )
    )
    add(
        Chat(
            "Vicky Kaushal",
            "https://static.toiimg.com/thumb/msid-71003675,width-800,height-600,resizemode-75,imgsize-73670,pt-32,y_pad-40/71003675.jpg",
            "Hey how are u?",
            "19/03/20",
            "0"
        )
    )
    add(
        Chat(
            "Ayushman Khurana",
            "https://pbs.twimg.com/profile_images/1137343534644621312/M4sYuCso_400x400.jpg",
            "Hey how are u?",
            "15/03/20",
            "2"
        )
    )
    add(
        Chat(
            "Hritik Roshan",
            "https://wikibio.in/wp-content/uploads/2018/12/Hrithik-Roshan-Image.jpg",
            "Hey how are u?",
            "12/03/20",
            "5"
        )
    )
    add(
        Chat(
            "Tiger Shroff",
            "https://img.etimg.com/thumb/width-640,height-480,imgsize-408708,resizemode-1,msid-72224533/tiger-shroff-scrapes-his-back-on-baaghi-3-set-posts-pictures-on-social-media.jpg",
            "Hey how are u?",
            "1/03/20",
            "3"
        )
    )
    add(
        Chat(
            "Ritesh Deshmukh",
            "https://filmfare.wwmindia.com/content/2018/dec/thu1545049017.jpg",
            "Hey how are u?",
            "20/02/20",
            "9"
        )
    )


}.toList()

val statusList = mutableListOf<Status>().apply {
    add(
        Status(
            "Shahrukh Khan",
            "https://static.toiimg.com/thumb/msid-69902898,imgsize-115506,width-800,height-600,resizemode-75/69902898.jpg",
            "Today, 4.50 pm"
        )
    )
    add(
        Status(
            "Salman Khan",
            "https://starsunfolded.com/wp-content/uploads/2013/08/Salman-Khan-picsss.jpg",
            "Today, 10.00 am"
        )
    )
    add(
        Status(
            "Akshay Kumar",
            "https://images.outlookindia.com/public/uploads/articles/2019/12/7/Akshay-Kumar-3_571_855.jpg",
            "Thursday"
        )
    )
    add(
        Status(
            "Aamir Khan",
            "https://filmfare.wwmindia.com/content/2020/apr/aamirkhan41588085012.jpg",
            "Monday"
        )
    )
    add(
        Status(
            "Amitabh Bachan",
            "https://c.tribune.com.pk/2017/11/1551269-amitabhbachancopy-1509963604.jpg",
            "22/04/20"
        )
    )
    add(
        Status(
            "Kartik Aryan",
            "https://imagevars.gulfnews.com/2018/12/03/TAB_181130_Kartik_Aaryan_AKK_16a08539c08_medium.jpg",
            "18/04/20"
        )
    )
    add(
        Status(
            "Saif Ali Khan",
            "https://images.khaleejtimes.com/storyimage/KT/20181015/ARTICLE/181019430/AR/0/AR-181019430.jpg&MaxW=780&imageVersion=16by9&NCS_modified=20181015110716",
            "10/04/20"
        )
    )
    add(
        Status(
            "Shahid Kapoor",
            "https://static.toiimg.com/thumb/msid-71336384,width-800,height-600,resizemode-75,imgsize-32094/71336384.jpg",
            "9/04/20"
        )
    )
    add(
        Status(
            "Vicky Kaushal",
            "https://static.toiimg.com/thumb/msid-71003675,width-800,height-600,resizemode-75,imgsize-73670,pt-32,y_pad-40/71003675.jpg",
            "19/03/20"
        )
    )
    add(
        Status(
            "Ayushman Khurana",
            "https://pbs.twimg.com/profile_images/1137343534644621312/M4sYuCso_400x400.jpg",
            "15/03/20"
        )
    )
    add(
        Status(
            "Hritik Roshan",
            "https://wikibio.in/wp-content/uploads/2018/12/Hrithik-Roshan-Image.jpg",
            "12/03/20"
        )
    )
    add(
        Status(
            "Tiger Shroff",
            "https://img.etimg.com/thumb/width-640,height-480,imgsize-408708,resizemode-1,msid-72224533/tiger-shroff-scrapes-his-back-on-baaghi-3-set-posts-pictures-on-social-media.jpg",
            "1/03/20"
        )
    )
    add(
        Status(
            "Ritesh Deshmukh",
            "https://filmfare.wwmindia.com/content/2018/dec/thu1545049017.jpg",
            "20/02/20"
        )
    )

}.toList()


val chat = mutableListOf<Conversation>().apply {
    add(Conversation(1, "Hey"))
    add(Conversation(2, "Hey"))
    add(Conversation(1, "Wassup"))
    add(Conversation(1, "How have you been?"))
    add(Conversation(2, "I am good"))
    add(Conversation(1, "Hey"))
    add(Conversation(2, "Hey"))
    add(Conversation(1, "Wassup"))
    add(Conversation(1, "How have you been?"))
    add(Conversation(2, "I am good"))
    add(Conversation(1, "Hey"))
    add(Conversation(2, "Hey"))
    add(Conversation(1, "Wassup"))
    add(Conversation(1, "How have you been?"))
    add(Conversation(2, "I am good"))
}

fun addChat(text: String) = chat.add(Conversation(1, text))