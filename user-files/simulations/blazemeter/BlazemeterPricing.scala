package blazemeter

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class BlazemeterPricing extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://www.demoblaze.com")
    .inferHtmlResources(AllowList(), DenyList())
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.9,ru-RU;q=0.8,ru;q=0.7,uk;q=0.6")
    .doNotTrackHeader("1")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36")
  
  private val headers_0 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Proxy-Connection" -> "keep-alive",
  		"Upgrade-Insecure-Requests" -> "1"
  )
  
  private val headers_2 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"Cache-Control" -> "max-age=0",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "none",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_3 = Map(
  		"Accept" -> "text/css,*/*;q=0.1",
  		"If-None-Match" -> """"TTo8pA"""",
  		"Sec-Fetch-Dest" -> "style",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_7 = Map(
  		"If-None-Match" -> """"TTo8pA"""",
  		"Sec-Fetch-Dest" -> "script",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_13 = Map(
  		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"If-None-Match" -> """"TTo8pA"""",
  		"Sec-Fetch-Dest" -> "image",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_18 = Map(
  		"Sec-Fetch-Dest" -> "script",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_22 = Map(
  		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"Sec-Fetch-Dest" -> "image",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_23 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"If-None-Match" -> """"TTo8pA"""",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "same-origin",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_24 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "same-origin",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_25 = Map(
  		"Accept" -> "text/css,*/*;q=0.1",
  		"Sec-Fetch-Dest" -> "style",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_35 = Map(
  		"If-None-Match" -> """"TTo8pA"""",
  		"Origin" -> "https://www.demoblaze.com",
  		"Sec-Fetch-Dest" -> "font",
  		"Sec-Fetch-Mode" -> "cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_42 = Map(
  		"Accept" -> "application/json, text/javascript, */*; q=0.01",
  		"If-None-Match" -> """"TTo8pA"""",
  		"Sec-Fetch-Dest" -> "empty",
  		"Sec-Fetch-Mode" -> "cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"X-Requested-With" -> "XMLHttpRequest",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val headers_43 = Map(
  		"Origin" -> "https://www.demoblaze.com",
  		"Sec-Fetch-Dest" -> "font",
  		"Sec-Fetch-Mode" -> "cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"sec-ch-ua" -> """" Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> """"Windows""""
  )
  
  private val uri1 = "www.demoblaze.com"

  private val scn = scenario("BlazemeterPricing")
    .exec(
      http("request_0")
        .get("http://" + uri1 + "/?utm_source=blog&utm_medium=BM_blog&utm_campaign=how-to-run-a-simple-load-test-with-gatling")
        .headers(headers_0)
    )
    .pause(14)
    .exec(
      http("request_1")
        .get("http://" + uri1 + "/")
        .headers(headers_0)
    )
    .pause(27)
    .exec(
      http("request_2")
        .get("/")
        .headers(headers_2)
        .resources(
          http("request_3")
            .get("/node_modules/bootstrap/dist/css/bootstrap.min.css")
            .headers(headers_3),
          http("request_4")
            .get("/node_modules/video.js/dist/video-js.min.css")
            .headers(headers_3),
          http("request_5")
            .get("/css/latostyle.css")
            .headers(headers_3),
          http("request_6")
            .get("/css/latofonts.css")
            .headers(headers_3),
          http("request_7")
            .get("/node_modules/videojs-contrib-hls/dist/videojs-contrib-hls.min.js")
            .headers(headers_7),
          http("request_8")
            .get("/node_modules/jquery/dist/jquery.min.js")
            .headers(headers_7),
          http("request_9")
            .get("/node_modules/tether/dist/js/tether.min.js")
            .headers(headers_7),
          http("request_10")
            .get("/node_modules/bootstrap/dist/js/bootstrap.min.js")
            .headers(headers_7),
          http("request_11")
            .get("/node_modules/video.js/dist/video.min.js")
            .headers(headers_7),
          http("request_12")
            .get("/js/index.js")
            .headers(headers_7),
          http("request_13")
            .get("/imgs/front.jpg")
            .headers(headers_13),
          http("request_14")
            .get("/bm.png")
            .headers(headers_13),
          http("request_15")
            .get("/Samsung1.jpg")
            .headers(headers_13),
          http("request_16")
            .get("/nexus1.jpg")
            .headers(headers_13),
          http("request_17")
            .get("/iphone1.jpg")
            .headers(headers_13),
          http("request_18")
            .get("/node_modules/videojs-contrib-hls/dist/videojs-contrib-hls.min.js")
            .headers(headers_18),
          http("request_19")
            .get("/node_modules/tether/dist/js/tether.min.js")
            .headers(headers_18),
          http("request_20")
            .get("/node_modules/bootstrap/dist/js/bootstrap.min.js")
            .headers(headers_18),
          http("request_21")
            .get("/js/index.js")
            .headers(headers_18),
          http("request_22")
            .get("/bm.png")
            .headers(headers_22)
        )
    )
    .pause(5)
    .exec(
      http("request_23")
        .get("/cart.html")
        .headers(headers_23)
    )
    .pause(8)
    .exec(
      http("request_24")
        .get("/cart.html")
        .headers(headers_24)
        .resources(
          http("request_25")
            .get("/css/latostyle.css")
            .headers(headers_25),
          http("request_26")
            .get("/css/latofonts.css")
            .headers(headers_25),
          http("request_27")
            .get("/node_modules/bootstrap/dist/css/bootstrap.min.css")
            .headers(headers_25),
          http("request_28")
            .get("/node_modules/bootstrap-sweetalert/dist/sweetalert.css")
            .headers(headers_3),
          http("request_29")
            .get("/node_modules/video.js/dist/video-js.min.css")
            .headers(headers_25),
          http("request_30")
            .get("/node_modules/jquery/dist/jquery.min.js")
            .headers(headers_18),
          http("request_31")
            .get("/node_modules/videojs-contrib-hls/dist/videojs-contrib-hls.min.js")
            .headers(headers_7),
          http("request_32")
            .get("/node_modules/tether/dist/js/tether.min.js")
            .headers(headers_7),
          http("request_33")
            .get("/node_modules/bootstrap/dist/js/bootstrap.min.js")
            .headers(headers_7),
          http("request_34")
            .get("/node_modules/bootstrap-sweetalert/dist/sweetalert.min.js")
            .headers(headers_7),
          http("request_35")
            .get("/css/fonts/Lato-Regular.woff2")
            .headers(headers_35),
          http("request_36")
            .get("/node_modules/video.js/dist/video.min.js")
            .headers(headers_18),
          http("request_37")
            .get("/js/cart.js")
            .headers(headers_7),
          http("request_38")
            .get("/bm.png")
            .headers(headers_13),
          http("request_39")
            .get("/imgs/front.jpg")
            .headers(headers_22),
          http("request_40")
            .get("/node_modules/bootstrap-sweetalert/dist/sweetalert.min.js")
            .headers(headers_18),
          http("request_41")
            .get("/js/cart.js")
            .headers(headers_18),
          http("request_42")
            .get("/config.json")
            .headers(headers_42),
          http("request_43")
            .get("/css/fonts/Lato-Regular.woff")
            .headers(headers_43)
        )
    )

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
