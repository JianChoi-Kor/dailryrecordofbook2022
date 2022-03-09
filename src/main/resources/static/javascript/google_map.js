var map;
var button = document.getElementById('map_button');
button.addEventListener('click', changeCenter);

function initMap() {
  var book = { lat: 35.837306731236715, lng: 128.5831126557821 };
  var center = { lat: 35.83862790853303, lng: 128.58180935912935 };
  map = new google.maps.Map( document.getElementById('map'), {
      zoom: 15,
      center: center
    });

  var mainMarker = new google.maps.Marker({
    position: book,
    map: map,
    label: "대구 독서모임 책방일지",
    icon: {
        url: "/images/dailyrecordofbook_marker.png",
        labelOrigin: new google.maps.Point(20, 58)
    }
  });

  var subwayMarker = { lat: 35.8410729558265, lng: 128.58127854986284};
  var subwayMarker = new google.maps.Marker({
      position: subwayMarker,
      map: map,
      icon: {
        url: "http://maps.google.com/mapfiles/ms/icons/red-dot.png",
        labelOrigin: new google.maps.Point(20, 47),
      },
      label: "현충로역"
    });

//    var busMarker = { lat: 35.838271754933196, lng: 128.579953506714};
//      var busMarker = new google.maps.Marker({
//          position: busMarker,
//          map: map,
//          icon: {
//            url: "http://maps.google.com/mapfiles/ms/icons/red-dot.png",
//            labelOrigin: new google.maps.Point(17, 39),
//          },
//          label: "버스정류장"
//        });
}

function changeCenter() {
  var dailyrecordofbook = { lat: 35.837306731236715, lng: 128.5831126557821 };
  map.panTo(dailyrecordofbook);
  map.setZoom(15);
}