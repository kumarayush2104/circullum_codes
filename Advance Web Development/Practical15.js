navigator.geolocation.getCurrentPosition((result) => { 
showInformation(result) })

function showInformation(position) {
  document.body.innerHTML += "Platform Information: " + 
navigator.userAgent +
    "<br>Number of CPU Threads: " + navigator.hardwareConcurrency +
    "<br>Available Device Memory (in GBs): " + navigator.deviceMemory +
    "<br>System Language: " + navigator.language +
    "<br>Screen Size: " + window.screen.width + "x" + window.screen.height
  navigator.getBattery().then((battery) => {
    document.body.innerHTML += "<br>Battery Charging: " + battery.charging 
+
      "<br>Battery Level: " + battery.level * 100 + "%" +
      "<br>Connection Type: " + navigator.connection.type + " (Works only 
in Chrome OS)" +
      "<br>Network Type: " + navigator.connection.effectiveType +
      "<br>Location: " + position.coords.latitude + ", " + 
position.coords.longitude +
      "<br>Last Updated: " + new Date(position.timestamp);
  }).catch(() => {
    document.body.innerHTML += "<br>Battery Status: No Battery Found"
    "<br>Connection Type: " + navigator.connection.type + " (Works only in 
Chrome OS)" +
      "<br>Network Type: " + navigator.connection.effectiveType +
      "<br>Location: " + position.coords.latitude + ", " + 
position.coords.longitude +
      "<br>Last Updated: " + new Date(position.timestamp);
  })
}
