package com.example.currencyinfo

import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONException
import org.json.JSONObject


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rqbtn.setOnClickListener {
            progressBar.visibility = ProgressBar.VISIBLE
            getdata()
            progressBar.visibility = ProgressBar.INVISIBLE
        }

        val handler = Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                if (checkBox.isChecked) {
                    progressBar.visibility = ProgressBar.VISIBLE
                    getdata()
                    progressBar.visibility = ProgressBar.INVISIBLE
                    Toast.makeText(this@MainActivity, "*** Auto refreshed! ***", Toast.LENGTH_LONG).show()
                }
                handler.postDelayed(this, 300000)
            }
        }, 0)
    }

    private fun getdata() {
        val queue = Volley.newRequestQueue(this)
        val url = "https://www.cbr-xml-daily.ru/daily_json.js"
        val stringRequest = StringRequest(com.android.volley.Request.Method.GET, url,
            { response ->
                try {
                    MultiText.setText("")
                    var nominal: Int
                    var charcode: String
                    var name: String
                    var value: Double
                    val jsonObject = JSONObject(response.toString())
                    val valute = jsonObject.getJSONObject("Valute")

                    val AUD = valute.getJSONObject("AUD")
                    nominal = AUD.getInt("Nominal")
                    charcode = AUD.getString("CharCode")
                    name = AUD.getString("Name")
                    value = AUD.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val AZN = valute.getJSONObject("AZN")
                    nominal = AZN.getInt("Nominal")
                    charcode = AZN.getString("CharCode")
                    name = AZN.getString("Name")
                    value = AZN.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val GBP = valute.getJSONObject("GBP")
                    nominal = GBP.getInt("Nominal")
                    charcode = GBP.getString("CharCode")
                    name = GBP.getString("Name")
                    value = GBP.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val AMD = valute.getJSONObject("AMD")
                    nominal = AMD.getInt("Nominal")
                    charcode = AMD.getString("CharCode")
                    name = AMD.getString("Name")
                    value = AMD.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val BYN = valute.getJSONObject("BYN")
                    nominal = BYN.getInt("Nominal")
                    charcode = BYN.getString("CharCode")
                    name = BYN.getString("Name")
                    value = BYN.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val BGN = valute.getJSONObject("BGN")
                    nominal = BGN.getInt("Nominal")
                    charcode = BGN.getString("CharCode")
                    name = BGN.getString("Name")
                    value = BGN.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val BRL = valute.getJSONObject("BRL")
                    nominal = BRL.getInt("Nominal")
                    charcode = BRL.getString("CharCode")
                    name = BRL.getString("Name")
                    value = BRL.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val HUF = valute.getJSONObject("HUF")
                    nominal = HUF.getInt("Nominal")
                    charcode = HUF.getString("CharCode")
                    name = HUF.getString("Name")
                    value = HUF.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val HKD = valute.getJSONObject("HKD")
                    nominal = HKD.getInt("Nominal")
                    charcode = HKD.getString("CharCode")
                    name = HKD.getString("Name")
                    value = HKD.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val DKK = valute.getJSONObject("DKK")
                    nominal = DKK.getInt("Nominal")
                    charcode = DKK.getString("CharCode")
                    name = DKK.getString("Name")
                    value = DKK.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val USD = valute.getJSONObject("USD")
                    nominal = USD.getInt("Nominal")
                    charcode = USD.getString("CharCode")
                    name = USD.getString("Name")
                    value = USD.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val EUR = valute.getJSONObject("EUR")
                    nominal = EUR.getInt("Nominal")
                    charcode = EUR.getString("CharCode")
                    name = EUR.getString("Name")
                    value = EUR.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val INR = valute.getJSONObject("INR")
                    nominal = INR.getInt("Nominal")
                    charcode = INR.getString("CharCode")
                    name = INR.getString("Name")
                    value = INR.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val KZT = valute.getJSONObject("KZT")
                    nominal = KZT.getInt("Nominal")
                    charcode = KZT.getString("CharCode")
                    name = KZT.getString("Name")
                    value = KZT.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val CAD = valute.getJSONObject("CAD")
                    nominal = CAD.getInt("Nominal")
                    charcode = CAD.getString("CharCode")
                    name = CAD.getString("Name")
                    value = CAD.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val KGS = valute.getJSONObject("KGS")
                    nominal = KGS.getInt("Nominal")
                    charcode = KGS.getString("CharCode")
                    name = KGS.getString("Name")
                    value = KGS.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val CNY = valute.getJSONObject("CNY")
                    nominal = CNY.getInt("Nominal")
                    charcode = CNY.getString("CharCode")
                    name = CNY.getString("Name")
                    value = CNY.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val MDL = valute.getJSONObject("MDL")
                    nominal = MDL.getInt("Nominal")
                    charcode = MDL.getString("CharCode")
                    name = MDL.getString("Name")
                    value = MDL.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val NOK = valute.getJSONObject("NOK")
                    nominal = NOK.getInt("Nominal")
                    charcode = NOK.getString("CharCode")
                    name = NOK.getString("Name")
                    value = NOK.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val PLN = valute.getJSONObject("PLN")
                    nominal = PLN.getInt("Nominal")
                    charcode = PLN.getString("CharCode")
                    name = PLN.getString("Name")
                    value = PLN.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val RON = valute.getJSONObject("RON")
                    nominal = RON.getInt("Nominal")
                    charcode = RON.getString("CharCode")
                    name = RON.getString("Name")
                    value = RON.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val XDR = valute.getJSONObject("XDR")
                    nominal = XDR.getInt("Nominal")
                    charcode = XDR.getString("CharCode")
                    name = XDR.getString("Name")
                    value = XDR.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val SGD = valute.getJSONObject("SGD")
                    nominal = SGD.getInt("Nominal")
                    charcode = SGD.getString("CharCode")
                    name = SGD.getString("Name")
                    value = SGD.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val TJS = valute.getJSONObject("TJS")
                    nominal = TJS.getInt("Nominal")
                    charcode = TJS.getString("CharCode")
                    name = TJS.getString("Name")
                    value = TJS.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val TRY = valute.getJSONObject("TRY")
                    nominal = TRY.getInt("Nominal")
                    charcode = TRY.getString("CharCode")
                    name = TRY.getString("Name")
                    value = TRY.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val TMT = valute.getJSONObject("TMT")
                    nominal = TMT.getInt("Nominal")
                    charcode = TMT.getString("CharCode")
                    name = TMT.getString("Name")
                    value = TMT.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val UZS = valute.getJSONObject("UZS")
                    nominal = UZS.getInt("Nominal")
                    charcode = UZS.getString("CharCode")
                    name = UZS.getString("Name")
                    value = UZS.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val UAH = valute.getJSONObject("UAH")
                    nominal = UAH.getInt("Nominal")
                    charcode = UAH.getString("CharCode")
                    name = UAH.getString("Name")
                    value = UAH.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val CZK = valute.getJSONObject("CZK")
                    nominal = CZK.getInt("Nominal")
                    charcode = CZK.getString("CharCode")
                    name = CZK.getString("Name")
                    value = CZK.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val SEK = valute.getJSONObject("SEK")
                    nominal = SEK.getInt("Nominal")
                    charcode = SEK.getString("CharCode")
                    name = SEK.getString("Name")
                    value = SEK.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val CHF = valute.getJSONObject("CHF")
                    nominal = CHF.getInt("Nominal")
                    charcode = CHF.getString("CharCode")
                    name = CHF.getString("Name")
                    value = CHF.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val ZAR = valute.getJSONObject("ZAR")
                    nominal = ZAR.getInt("Nominal")
                    charcode = ZAR.getString("CharCode")
                    name = ZAR.getString("Name")
                    value = ZAR.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val KRW = valute.getJSONObject("KRW")
                    nominal = KRW.getInt("Nominal")
                    charcode = KRW.getString("CharCode")
                    name = KRW.getString("Name")
                    value = KRW.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                    val JPY = valute.getJSONObject("JPY")
                    nominal = JPY.getInt("Nominal")
                    charcode = JPY.getString("CharCode")
                    name = JPY.getString("Name")
                    value = JPY.getDouble("Value")
                    MultiText.append("$nominal $charcode ($name) = $value\n")
                } catch (e: JSONException) {
                    Toast.makeText(this@MainActivity, "*** JSONException! ***", Toast.LENGTH_LONG).show()
                }
            },
            { Toast.makeText(this@MainActivity, "*** Data request error! ***", Toast.LENGTH_LONG).show() })
        queue.add(stringRequest)
    }
}


