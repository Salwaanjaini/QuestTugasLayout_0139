package com.example.questtugaslayout

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ActivitasPertama(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                top = 70.dp,
                start = 16.dp,
                end = 16.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(R.string.prodi),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(R.string.univ),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.size(18.dp)
        )



        CardMahasiswa(
            nama = R.string.nama_1,
            nomor = null,
            alamat = R.string.alamat_1,
            warnaCard = R.color.card_1_bg,
            warnaNama = R.color.card_1_text
        )

        Spacer(
            modifier = Modifier.size(10.dp)
        )


        CardMahasiswa(
            nama = R.string.nama_2,
            nomor = R.string.nomor_2,
            alamat = R.string.alamat_2,
            warnaCard = R.color.card_2_bg,
            warnaNama = R.color.card_2_text
        )

        Spacer(
            modifier = Modifier.size(10.dp)
        )


        CardMahasiswa(
            nama = R.string.nama_3,
            nomor = R.string.nomor_3,
            alamat = R.string.alamat_3,
            warnaCard = R.color.card_3_bg,
            warnaNama = R.color.card_3_text
        )

        Spacer(
            modifier = Modifier.size(10.dp)
        )

        CardMahasiswa(
            nama = R.string.nama_4,
            nomor = R.string.nomor_4,
            alamat = R.string.alamat_4,
            warnaCard = R.color.card_4_bg,
            warnaNama = R.color.card_4_text
        )
    }
}

@Composable
fun CardMahasiswa(
    @StringRes nama: Int,
    @StringRes nomor: Int?,
    @StringRes alamat: Int,
    @ColorRes warnaCard: Int,
    @ColorRes warnaNama: Int,
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier
            .fillMaxWidth(),

        shape = RoundedCornerShape(10.dp),

        colors = CardDefaults.cardColors(
            containerColor = colorResource(warnaCard)
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 10.dp,
                    vertical = 8.dp
                ),

            verticalAlignment = Alignment.CenterVertically,

            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Image(
                painter = painterResource(
                    R.drawable.logo_umy
                ),

                contentDescription = null,

                modifier = Modifier.size(58.dp)
            )


            Spacer(
                modifier = Modifier.width(10.dp)
            )



           