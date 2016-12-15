<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Korisnik</title>
</head>
<body bgcolor=#ffc04d>
<div class="page-header" align="center">
  <h1>Wedding Day <br> <small>Organiziraja tvotaja svadba.</small></h1>
</div><br>
<div align="center">
<form action="AddWedding.jsp" method="post">
 <p><b><i>Vnesete ja datata na vasata svadba.</i></b></p><br>

<p><b><i>Izberete go gradot na vasata svadba.</i></b></p><br>
  <select name="grad">
    <option value="skopje">Skopje</option>
    <option value="bitola">Bitola</option>
    <option value="ohrid">Ohrid</option>
    <option value="prilep">Prilep</option>
    <option value="strumica">Strumica</option>
    <option value="veles">Veles</option>
    <option value="kavadarci">Kavadarci</option>
    <option value="kumanovo">Kumanovo</option>
    <option value="negotino">Negotino</option>
    <option value="tetovo">Tetovo</option>
  </select>
  <br><br>
  <div>
  <button type="submit">Submit</button>
  </div>
  <br><br>
<img src="sliki/restoran.JPG" width="990" height="320"><br>
<p><b><i>Izberete ja lokacijata na vasata svadba.</i></b></p>
  <select name="ликација">
    <option value="vezilka">Vezilka</option>
    <option value="vavilon">Vavilon</option>
    <option value="arena">Arena</option>
    <option value="mirage">Mirage</option>
    <option value="romansa">Romansa</option>
  </select>
<br><br>
  <input type="submit">
<br><br>
<div align="center">
Sala: <input type="text" name="text"><br>
<label>(Mala,Sredna,Golema)</label><br><br>
Porcija: <input type="text" name="text"><br>
<label>(Osnovna,Specijalna)</label><br><br>
Gosti: <input type="text" name="text"><br><br>
</div><br>

<img src="sliki/music.jpg" width="990" height="320"><br>
<p><b><i>Izberete ja vasata omilena muzicka grupa.</i></b></p>
  <select name="muzika">
    <option value="pletenka">Pletenka</option>
    <option value="boemi">Boemi</option>
    <option value="3D band">3D Band</option>
    <option value="molika">Molika</option>
  </select>
<br><br>
  <input type="submit">
<br><br>
<div align="center">
Broj na sviraci: <input type="text" name="text"><br><br>
<p><b><i>Izberete izveduvac: </i></b></p>
<select name="pejac">
    <option value="filip bozinovski">Filip Bozinovski</option>
    <option value="aneta molika">Aneta Molika</option>
  </select>
</div><br>

<img src="sliki/torta.jpg" width="990" height="320"><br>
<p><b><i>Izberete ja slatkarnicata koja ke ja izraboti vasata nevestinska torta.</i></b></p>
	<select name="torta">
    	<option value="slatka kuka">Slatka kuka</option>
    	<option value="marta">Marta</option>
  	</select>
  	<br><br>
  <input type="submit">
<br><br>
<div align="center">
Broj na spratovi: <input type="text" name="text"><br><br>
<p><b><i>Izberete vkus: </i></b></p>
<select name="vkus">
    <option value="cokoladna">Cokoladna</option>
    <option value="ovosna">Ovosna</option>
  </select>
</div><br>

<img src="sliki/cveke.jpg" width="990" height="320"><br>
<p><b><i>Izberete ja vasta omilena cvekara.</i></b></p>
	<select name="cveke">
    	<option value="Art">Art</option>
  	</select>
  	<br><br>
  <input type="submit">
<br><br>
<div align="center">
Boja: <input type="text" name="text"><br><br>
<p><b><i>Ureduvanje na: </i></b></p>
</div><br>






<img src="sliki/crkva.jpg" width="990" height="320"><br>
<p><b><i>Izberete religiozen objekt.</i></b></p>
	<select name="crkva">
    	<option value="sv bogorodica">Sv. Bogorodica</option>
    	<option value="kamensko">Kamensko</option>
  	</select>
  	<br><br>
  <input type="submit">
<br><br>

<img src="sliki/frizura.jpg" width="990" height="320"><br>
<p><b><i>Izberete go vasiot frizerski salon.</i></b></p>
	<select name="frizura">
    	<option value="karmen">Karmen</option>
  	</select>
  	<br><br>
  <input type="submit">
<br><br>
<p><b><i>Izberete: </i></b></p>

<img src="sliki/fustan.jpg" width="990" height="320"><br>
<p><b><i>Izberete go vasiot nevestinski salon.</i></b></p>
	<select name="fustan">
    	<option value="simona">Simona</option>
  	</select>
  	<br><br>
  <input type="submit">
<br><br>
<div align="center">
Boja: <input type="text" name="text"><br><br>
Dolzina: <input type="text" name="text"><br><br>
Goleminski Broj: <input type="text" name="text"><br><br>
</div><br>

<img src="sliki/kostum.jpg" width="990" height="320"><br>
<p><b><i>Izberete go vasiot butik za maska garderoba.</i></b></p>
	<select name="kostum">
    	<option value="linkesti">Linkesti</option>
  	</select>
  	<br><br>
  <input type="submit">
<br><br>
<div align="center">
Boja: <input type="text" name="text"><br><br>
Goleminski Broj: <input type="text" name="text"><br><br>
</div><br>

<img src="sliki/cevli.jpg" width="990" height="320"><br>
<p><b><i>Izberete go vasiot butik za cevli.</i></b></p>
	<select name="cevli">
    	<option value="biana">Biana</option>
  	</select>
  	<br><br>
  <input type="submit">
<br><br>
<div align="center">
Boja: <input type="text" name="text"><br><br>
Goleminski Broj: <input type="text" name="text"><br><br>
</div><br> 

<img src="sliki/sminka.jpg" width="990" height="320"><br>
<p><b><i>Izberete go vasiot kozmeticki salon.</i></b></p>
	<select name="kozmetika">
    	<option value="kala">Kala</option>
  	</select>
  	<br><br>
  <input type="submit">
<br><br>
<div align="center">
Boja: <input type="text" name="text"><br><br>
</div><br> 

<img src="sliki/fotostudio.jpg" width="990" height="320"><br>
<p><b><i>Izberete go vaseto foto studio.</i></b></p>
	<select name="fotostudio">
    	<option value="zaga">Zaga</option>
  	</select>
  	<br><br>
  <input type="submit">
<br><br>
<div align="center">
Broj na sliki: <input type="text" name="text"><br><br>
</div><br> 

<div class="panel-body" align="center"></div>
<input type="submit" value="Organiziraj" class="btn btn-warning"/>
</form>

</div>

</body>
</html>