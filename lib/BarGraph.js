import PropTypes from 'prop-types';
import { requireNativeComponent } from 'react-native';

var viewProps = {
    name: 'BarGraph',
    propTypes: {
        width: PropTypes.number,
        height: PropTypes.number,
    }
}

module.exports = requireNativeComponent('BarGraph', viewProps);

