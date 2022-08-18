<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List, com.advancia.wsImport2.ws.client.IdCard, java.text.SimpleDateFormat, java.text.DateFormat"%>
<%
List<IdCard> cardList = (List<IdCard>) request.getAttribute("card-list");
if (cardList == null) {
	response.sendRedirect("get-list");
} else {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="author" content="Giuseppe Marchesiello">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<title>ID Card List</title>
</head>
<body>
	<main class="p-5">
		<section class="container d-flex align-items-center justify-content-between flex-wrap">
			<%
			for (IdCard currentCard : cardList) {
			%>
			<div class="card mb-3" style="width: 18rem;">
				<img src="<%="data:image/png;base64," + currentCard.getPhoto()%>"
					class="card-img-top">
				<div class="card-body">
					<h5 class="card-title"><%=currentCard.getName() + " " + currentCard.getSurname()%></h5>
					<p class="card-text">
						Age:
						<%=currentCard.getAge()%><br /> Date of Birth:
						<%=dateFormat.format(currentCard.getBirthDate().toGregorianCalendar().getTime())%>
					</p>
				</div>
			</div>
			<%
			}
			%>
		</section>
	</main>
</body>
</html>
<%
}
%>