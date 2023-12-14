<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Feedback Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
    .social{
    text-align: center;
    align:center;
     justify-content: space-between;
       padding: 0px;
            text-align: center;
            display: flex;
            justify-content: space-between;
            align-items: center;
}
body {
            padding-top: 56px; /* Adjusted for fixed navbar */
        }
  .details{
    text-align: center;
    align:center;
}
    .home-button, .feedback-button,.book, .book-dropdown {
            padding: 10px;
            background-color: #555;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .dropdown-content {
            display: none;
            position: absolute;
            background-color: #555;
            min-width: 160px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
            z-index: 1;
        }

        .dropdown-content a {
            color: #fff;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
            border-bottom: 1px solid #ddd;
        }

        .dropdown-content a:last-child {
            border-bottom: none;
        }

        .book-dropdown:hover .dropdown-content {
            display: block;
        }

        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            background-color:grey;
            color: #fff;
            padding: 10px;
            text-align: center;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        header img {
            height: 40px; /* Adjust as needed */
        }

        header h1 {
            margin: 0;
        }

        footer {
            background-color: grey;
            color: #fff;
            padding: 10px;
            text-align: center;
            position: fixed;
            bottom: 0;
            width: 100%;
            display: flex;
            justify-content:center;
            align-items: center;

        }
          .navigator {
            display: flex;
            justify-content: space-between;
            padding: 5px;
        }


        footer a {
            color: #fff;
            margin: 0 10px;
            text-decoration: none;
            text-align:center;
            align:center;
        }
    </style>
</head>
<body>

<header>
    <div class="social">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmm-bTEQCah55y8cxaOehZr9IAW-gyY2zgqF1LFHVe1g&s" >
        <a href="getAll">Get the List of Users</a>

    </div>

    <div style="margin:auto;width:30%">
        <h3>Resorts Details</h3>
    </div>

</header>

<div class="navigator">
    <a href="" class="home-button">Home</a>
    <a href="index1.jsp" class="feedback-button">Feedback</a>
    <a href="index2.jsp" class="book">Book</a>

    <div class="book-dropdown">
        <button class="book-button">Veiw Details</button>
        <div class="dropdown-content">
            <a href="#">Option 1</a>
            <a href="#">Option 2</a>
            <a href="#">Option 3</a>
        </div>
    </div>
</div>


<!-- Middle Section -->

<!-- Header -->


<div class="col-md-6 mb-4">
    <div class="card">
        <h5 class="card-title">Bangalore Resort</h5> <img src="https://dynamic-media-cdn.tripadvisor.com/media/photo-o/28/bc/f4/96/olde-bangalore-hotel.jpg?w=700&h=-1&s=1" height="100" width="100" >
        <p class="card-text">Bangalore resorts are flourishing into many lives to rejuvenate minds and hearts with the gist of positivity and optimism. One can delve into the charm of opulence and choose multiple activities based on likes including games and small-scale adventures. Not just the tinge of comfort, but many exciting experiences are waiting here.
            </p>

    </div>
</div>


        <!-- Place 3 -->
        <div class="col-md-6 mb-4">
            <div class="card">
                <h5 class="card-title">Mysore Resort</h5><img src="https://lh3.googleusercontent.com/p/AF1QipM2DQ_AtDAEKiKjtEq8czEgWuyWREjB75OdE3bm=w287-h192-n-k-rw-no-v1" height="100" width="100">
                <p class="card-text">Mysore resorts are flourishing into many lives to rejuvenate minds and hearts with the gist of positivity and optimism. One can delve into the charm of opulence and choose multiple activities based on likes including games and small-scale adventures. Not just the tinge of comfort, but many exciting experiences are waiting here.
                    </p>

            </div>
        </div>

<footer>


    <div class="social">

            <p id="datetime"></p>

        <h5 >&lt;&lt;&lt;&copy;For More About Me&copy;&gt;&gt;&gt;</h5 >

        <a href="https://github.com/Prema320/javacodes" target="_blank" ><img src="data:image/png;base64,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" height="30" width="30"></a>
        <a href="https://www.linkedin.com/in/prema-t-c-524b74294/details/education/" target="_blank"><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAHwAAAB8CAMAAACcwCSMAAAAZlBMVEUKZsL///8AZMEqa8T4+/03cMUAXb8AYcAAWr8AX8BZg8yvxOVCfMoAVr1EeMilueDX4fJyltK8zelfjdDt8vlWh84ocMXN2e6qv+M5dMfm7feNqdrf5vSdtN8AUbzC0ep5ndVkiM5LVvwmAAAFCElEQVRogcWb6ZqrIAyGES3QVuu41Va7nLn/mzy41aUGg+Lw/ZmH1ulrWEMIxNFXmsdhGWX+1SXEvfpZVIZxnq74IaLLDRPCj4wdOaWUSMk/TZkkoe4b6MAft+zAGG+gU8l3YOyQ3R57wNPwxASf5Q7egAt2CtH2I+FxEogF8OcFhEhic3Av5AHHkRvJx0PPCDwtGUMaPTCfsXK59pfg3pPooxs8fS5ZvwCP79imnsGL+0LbK+FFEqxG1/ggKdbCn3rdbE48eK6CFxexFV1JXGDjQXhMN5vdiFOw5SF4ua6Pz4myUg+eGanyTiLTgHuHo0k2IcfD7JCfgz+W1g99UT632s3Ac2KcLekkx8BzYqibj8Vn6F/wxz7siv5V81O4Z769O1E+7XVT+GE3trT9oIZnhsfYWMdMBS+Nzi3fEiUMj3dmS3oMwYt5p9ikKC0A+GWnQTYUv8zDn7tXeiXxnIMXwV+wCQmKGXgCVTpdKeDnePINjyHDGXVXCXS5g3gK9+7zj9IgLLxVKs4And69CRzqbYHS91UrBdaJT59r4SmwhrPberbjvOcna0rSEbxkwGMbDJdt6QImlUO4BzWPi9lswgLWSMq8ATycN3wvOGHhAA55EHvBKe/h4BjfC96O9RoOT24jeB7HOuEeFbyZ5ip4Cs7qQ3h+ESLgkVZVwE5ZkLbwEFzOBvBcVNVD2d0MXIQt/AQ+0sM/069QbbjxcHpq4A9gnI3g765p6FWj4hW+MHvU8BvsRPTwvmleGjFOBVzcangGe089vH/DwAycZxU8VTzRw/OubahvptrpIZXwHG7yYW/32/oJQjxbuf9huYRD8/oEXvBqfaRBooJpwUMJB6e3MdxJI/Z6XXXsVsPlJEccVShgPL2mj0JzqlfBqURDvs4MXF9KOE9JrtqX7gknx5zEiv6Ghxfv83lmyVPCWUxUnX0IL6NGyXtUrFa59MlegjERvLJYBx6SElntJ8ZrBee6eGmLQroi/faAs1OKhh9LEqm2pkN4t6o1cL8tMjnxDgmceFg4j0im+n4ZzvNJSH4U+lDCaUb8bXDy9fuvNxbuk+tG+Ne/018s/EpcxdcYePWU7HiDIitw8CWh4Iz8RtGp3/ME77+Ds3+1pe/PvmwQ21+Cb612HrUP5J2XNwg9qOHu5g7Xu3TdoK0dU1yH2zjUeD+sn+1cSX0k3N86yQwauItfouHZ5um1D110jU4vHgoup1f0wgLAzx/4Twf3cXC5sGCXVPNwuaRinYkd4DH5sVftP2gH0ji8ciCxrrMGHNfbK9cZu2kwDq83DcjtknF4vV1CbhTNw3P0Ftk4vNki44IDxuFNcAAXFjEOb8MiqICQcXgbEEKFwkzDu1AYLgh44s2xTQdvi0P4q/mIY+CfIGCKgUeXRodmL5jcR8VKD7f56P6LgXfhT1Tgtz+5GRedXt+fIQK/dkPeVoP9do85rB7wwEdba3Jpe6GOtpwUOHcdDOMVAiJd00M96DiTHreYDhg+Pc6ED3L5e22zv9356eP7IBcc65S5h1Vyj0BX/z7Ctnt4bzdtwWrCht1UFbtJOlbTk+wmZtlNSds3GY8uJOPZTUO0moBpN/XUbtJtlW5s3HZ0urHdRGvHaoq5Yze53u61ArsXKhyrV0kcu5doHKvXh5xNF6fI1otTjtUrY7X19i7L1bJ3TbCWxQuStexdDW1k71Js/wbtdWDSXwf+WbOP/w8kalZwcIx2RgAAAABJRU5ErkJggg==" height="30" width="30"></a>
        <a href="https://www.instagram.com/premasonu123/" target="_blank"><img src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIAH0AfQMBEQACEQEDEQH/xAAbAAEAAgMBAQAAAAAAAAAAAAAABgcDBAUBAv/EAEwQAAEDAgIEBgsMCAcBAAAAAAEAAgMEBQYRBxIhMRNBUWFxgRciUpGTobGys9HSFRYyNkJVcnOUwcLiFDdiZHR1kvAmRGNlgoOiI//EABoBAQACAwEAAAAAAAAAAAAAAAADBAIFBgH/xAA3EQACAQIDAwkGBgMBAAAAAAAAAQIDBAUREiFBoRMVMVFhgZGx0RQiNFJxwTNCYnLh8CMyQyT/2gAMAwEAAhEDEQA/ALxQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBARTEmOKCzyvpqdv6ZVt2OYx2TWHkc7bt5gD1K9b2FSt7z2IgqXEYbFtZEptJF7c8mKGhjbxNMbnHv6wWxWF0UtrfD0IVcTZj7I1/7ig8C72l7zXb9b8V6E0akmedke/9xQeBd7Sc12/W/FehNHaOyPf+5oPAO9pec2UOt+K9CVRzPOyPiDubf4B3tpzZQ634r0JY0YsdkjEHc2/wDvbXvNlv1vh6E8bam+sdkfEPc2/wDvbWPNtDt4ehKrOl2+P8G7QaTLgx4FwoaeZme0wExkDmBJB8ShqYbD8ksvqJYfF/6vL6k/sd7ob5TcPQS62rsfG7Y+M8hC1lWjOk8pGvq0Z0nlJHSUREEAQBAEBFdIN+ks9rbBSv1KurJaxw3saPhOHPtAHTzK7Y0FVqZy6ERVpNR2FQroEyioHyVlmTwpnSoMP3i4sD6K21ErDufqhjT0FxAKhndUYbJSLMYZG57ycTfNL/AA8XtqP2+2+bg/Qnio9Z57ysTfNEnh4fbXnt9t83B+hKnBbwcFYm+Z5PDw+2vPbrf5+D9CaNSmt54cGYlaMzZ5cuUTRHyPT223+fg/QnjWor83mcmroaqhl4KtppoJOJsrC3Poz3qWNSM1nF5lqnpks4vMxALxssxidCx3Sos1xiraU7WnJ7M9kjeNp/veoK1NVY6WeVqEa0NEi8qKpirKSGqgdrRTMEjDygjMLQSi4tpnMzi4ScZdKM68MQgCAICqNKcrn4jhiJ7VlK0tHOXOz8gW5w7JUm+0cnq2kO3K/qPVQLJwNg2FtPHdLtEJJZAHQwPHasbxOI4z5Olam8vJNuEHsPGkug3bxpBttvldBRROrnt2FzHasY/wCXH1BRUrGpNZy2FmFtOW17Dmdk93zOPtX5FNzd+rh/JMrFveOye75nH2r8ic3fq4fye+wPr/viOye75nH2r8i85v8A1cP5Peb38398T6ZpO7Ya9nIbx6tTmfNR4f1S4GXNr3S4EhoLrZMX0clMWCTtc308wye3nHrCqyp1beWfEq1KVW2kpcSucW4dfYK8NYXSUk2ZhkO/naeceNbO3r8rHtN3Z3Crx29K6ThZKfMuFw6PJXS4Soi856pkYOgPcB4lprtJVnl/dhzmIxUbmWXZ5EkVYpBAEAQFTaUB/ihv8JH5z1tbOWVLvNja0tdPPtOHhyhbcb9QUkgzZJMNYcrR2xHeBU1as4020S1aWim5FiaSrnJQ2eOkgcWPrHFjiDkQwDtvKB1rXWkU56nuKtlR5Sbb3FVZcy2fKm6jSPWsc9zWMaXOccmtaMyTzBOUJeTS2s7lNg6/1DNdtuexp3cI9rM+onNQu7preVJXVtH83hmadxsN1tbdevoJYmd3sc3vjMDrWUa8JdDJqVajU2Qkd7R3Z7fc6yrdcI2TGFrSyF+4555kjj3DvqG6rTilpeRWxCrUoxiobM95kxhTU+G8Q0VVZgIJNXhHRNOwZHLdyOGYyShOVam4z2iycrmjKNXb/fsSzGEMV2wdLVNGxsTaqM8gAzP/AJzCqW7cKyXcULJuldKPbl9ipMlt8zpS3NHGzCVL9ZN6Ry1N3+K+7yObxP4mXd5IkyrFAIAgCAqnSYM8Tt/hI/OerVGpphkdBhlPVQz7X5I0MDtyxfa/pyeiesqlTODRPfU8rWb+nmiSaVxm619Ev4FDSnpzKWDxz1933IC2Jz3NYxpc5xAaANpJ3BTcsbzQks2Wth2w0OGLa6trjGKkM1p6h+6Mdy3kHlPUFBOpKbyOYubmpd1NEOjcjl12kWNkxbQ290sYPw5ZNTPqyK8UFvZcp4LNr35ZPxOnYcY0F6l/Q6iI01RIMmskIcyTmB5eYryUWtqKt1htW3WtPNLgRzGeH3WKoZdbO+Snhe7VeInFpiceQj5J5PWrFKrqWmRdw+5VwuRqrN9u8h80klRK6WokfLK7a58ji4nrKtRaXQbWNNRWUVki16j9XEn8nPolSh8Qvr9zm4fHr9/3KmWzTOlZbWjr4p0v1kvpHLWXX4r7vI5rE/iZd3kSVVygEAQBAVdpIZniRp/dWec9RzqaXkdTg0c7V/V+SNLBTMsV208j5PRPXkaubyLGJxys593miQ6Um6zrZ0S/gXtSek12BLPlO77kewbTNmxNQh4za1zn5dDSR48ljCpnLI2WJtwtJtdi4kk0m1MggoqNpIjkc6R/Plll5VlOek1eB0k5zqPds8SvyxYqqdFpAzaQ5pLS05gjeDyqVVDxwT2Mtiud7q4IllmA15aHhDs3PDcwe+FnF5PM46muRvVFbpZcSo1bjM6xotif9XEg/wBnPolBB/5k+05SPx6/f9yp8lsFI6Zls6O/ipS/WS+kcqFz+IczifxMu7yJKoCgEAQBAVrpBbniEfwzPK5a66nlPI6zBPhX+5+SNPBzMsUW8/tP9G9YW886qRPivwc+7zR3tJTdZ1u6JPwqa8llpNbgP/Tu+5GLHUi3Xekq3Z6kb+3+iQQfEVVpVtM02bi9outbyprpZOcZ2h93tsc1IBJPB2zGj5bTvA8RWxrQc45xOawu7VtVansT6exlaPjLXEOBaRvBGRCoqeR16aazRsWq01N2rG01KwnM9vJl2sbeUqxSbk8kVrq5p20Nc+5dZYmLamG0YWfSxnIyRCmibx5EZHvDNXM8jl8PpyuLtSe55sqkhSQkdW0WtN+rt/8AKD6JI/7o5GPx6/f9ypyr2o6dls6PPipS/WS+kcqld++zmcT+Kl3eSJIoTXhAEAQFdY9bnfwf3ZnlctRev/L3I6vBX/5X9X5I1MJjVxHQuO7WcO+xw+9RWr/zR/u4mxR52k19PNHf0hRl/wCgOA2DhBn/AEq1iLy0mswSWTmvp9yIcCtZqN/qJHh7EjrfG2lrWukp27GPG1zByc4V+3vNC0z6DTX2GKtLlKWx711kgfPh24kSzPoJXcsuqHdee1XtdCptzRqVTvqGyKkvpmYqrEdjtNOWUr4pCN0NKBln0jYF669KK2PwJKeH3lxLOaa7WV5fbtU3msM9T2rW7I42nYwevlKh5VzeZ01pZ07Wnpj072ctysQkWGi1qocHo+kbJ2p9ytUg8R4PJTxe1HHw96/WXz/cqfJWFI6hlr6PRlhWm+nL57lDUecjl8U+Kl3eSJIozXhAEAQEAxu3O+A/6DfK5aa//G7jp8HeVs/q/JHJonPpqmKoj+FG8PHUqUamiSktxerJVIOD3k/uFNDfbS3gnAa2T43HidyHxgreVYRuaPu9xytGpO0r7V0bGQmoopqaUxVEZY8cR4+jlWgnGVN6ZrJnSU7iFRaovM1nxIpE6ma0sazTJoyNSRuSnjIlTNZ4VmDMjtYYw5UXarjlmjcyhYc3vcMtf9lvLnyq7STe01eIYhC3g4xec3w7WSfSHdI6a1ttsZ/+1RkXAfJYD95GXfVlvI0+EW7nV5V9C8yuMtiyUjo2Wro/+K1N9OXz3LyT2nLYr8VLu8iRrw1wQBAEBEMZ0hNbBUAbHx6hPODn9/iWnxKOUlLrN5hNX3JQ7czixQcy1LkbKUzsWmsmt51WjXhcc3MPlCsW97Kg8uldRr7qhCvt6Gd9twt9UwCYsH7Mzd3f2LbxvbaqspNd5qnQr03s4Hy4WT5Qt/WGLLVZdceBknd7tXExu97w+F7mdfBr1StOuPAyXt27VxMTnYY+UbR18GslK2/TwM0sQ3a+J8cNhSI64daA4cbeDJWalQ3ZHujEZbMp8TQu+N6GmiMdraambLIOLS1jfvPV31668fyli2watUedX3VxK+rKmeuqZKmqkMk0hzc4/wB7lgpZ7To6dKFKKhBZJGEjIZlSpnrRb2EaR1FhyihkaWvLOEcDvBcS7LxqQ42/qKpczkvp4bDsIVAgCAIDWuFHHW0zoZOPaD3J5VFXoqtBwZLRqypT1RItJQy0kvBzNyPEeI9C5avRnRlpmbqNxGos4mVkXMqzZi5h8QyXibPFI0qhgUqZYgzm1DQpolyDObON6sRLcGaMqsRZOjAQrMD0+VPExZKsI4Ylr546yujLKNhDmtcNsx6O58qsQi+lmlxHEY04unTecnwLKAyClOYPUAQBAEAQHw+NkjdV7Q5vIRmsZwjNaZLNHqbTzRg9z6bPZHl0OKpSwy1k89PFkvL1Os8NtpTvY7+srHmq1+Xix7RU6zE6z0L98bv6ysubLb5eLM1d1V0PgjE7Dtsf8KF5/wC13rWSw63W7iyRYhcLofBGF2FbO7fTv8M/1rJWVBdC4szWKXS/NwRjODrId9NJ4d/rWataS3cWZ873fzcF6Hx7yrCf8rJ9of61lyEOoc8XnzcF6G3RYYs1E8PhoYy9pzDpCXkHm1s1mqcV0Igq4hc1VlKezs2eR1gMlmUz1AEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEB//9k=" height="30" width="30"></a>
    </div>


</footer>
<script>
    function updateDateTime() {
      var currentDate = new Date();
      var dateString = currentDate.toDateString();
      var timeString = currentDate.toLocaleTimeString();
      var dateTimeString = dateString + ' ' + timeString;
      document.getElementById('datetime').innerHTML = dateTimeString;
    }
    updateDateTime();
    setInterval(updateDateTime, 1000);

  </script>


</body>
</html>
