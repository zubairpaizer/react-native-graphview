import PropTypes from 'prop-types';
import { requireNativeComponent } from 'react-native';

var viewProps = {
    name: 'PointsGraph',
    propTypes: {
        width: PropTypes.number,
        height: PropTypes.number,
    }
}

module.exports = requireNativeComponent('PointsGraph', viewProps);

