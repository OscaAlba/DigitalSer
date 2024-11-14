package alba.oscar.digitalserv

import android.annotation.SuppressLint
import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    Scaffold(
        topBar = {

            TopAppBar(
                modifier = Modifier
                    .height(height = 65.dp)
                    .fillMaxWidth(),
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = { Text(text = "Inicio")
               }
            )
        }
    ) {

    }


    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(painter = painterResource(id = R.drawable.pc),
                contentDescription = "pcImage",
                modifier = Modifier
                    .size(100.dp)
                    .clickable {
                        navController.navigate("computer_Screen")
                    })

            Image(painter = painterResource(id = R.drawable.mouse),
                contentDescription = "mouseImage",
                modifier = Modifier
                    .size(100.dp)
                    .clickable {

                    })

            Image(painter = painterResource(id = R.drawable.keyboard),
                contentDescription = "keyboardImage",
                modifier = Modifier
                    .size(100.dp)
                    .clickable {

                    })
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(painter = painterResource(id = R.drawable.printer),
                contentDescription = "printerImage",
                modifier = Modifier
                    .size(100.dp)
                    .clickable {

                    })

            Image(painter = painterResource(id = R.drawable.server),
                contentDescription = "serverImage",
                modifier = Modifier
                    .size(100.dp)
                    .clickable {

                    })
            }


        }


    }



