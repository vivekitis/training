var countryHelper = {

  get: function (guid) {
    return _.findWhere(this.getAll(), { guid: guid });
  },

  getAll: function () {
    return countries;
  },

  getInfo: function (guid) {
    var country = this.get(guid);
    var deferred = $.Deferred();
    
    if (country.info || country.info === null) {
      deferred.resolve(country.info);

    } else {
      $.get(encodeURI("https://restcountries.eu/rest/v2/name/" + country.name)).done(function (guid, result) {
        result[0].name = this.getName(guid);
        this._setInfo(guid, result[0]);
        deferred.resolve(result[0]);

      }.bind(this, guid)).fail(function (result) {
        this._setInfo(guid, null);
        deferred.reject(result.statusText);

      }.bind(this, guid));
    }

    return deferred.promise();
  },

  getName: function (guid) {
    var country = this.get(guid);

    if (!country.name) {
      this._setName(guid, guid.toLowerCase().replace(/-/g, " ").replace(/\b[a-z]/g, function (a) {
        return a.toUpperCase();
      }));
    }

    return country.name;
  },

  _setName: function (guid, name) {
    this.get(guid).name = name;
  },

  _setInfo: function (guid, info) {
    this.get(guid).info = info;
  }

};
